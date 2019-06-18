package org.mazz.restroservice.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.mazz.restroservice.custommodal.ItemCustomModal;
import org.mazz.restroservice.custommodal.KotDetailsCustomModal;
import org.mazz.restroservice.custommodal.TableCustomModal;
import org.mazz.restroservice.entity.ItemMast;
import org.mazz.restroservice.entity.KotDetail;
import org.mazz.restroservice.entity.NumberMaster;
import org.mazz.restroservice.entity.PosMast;
import org.mazz.restroservice.entity.RateMast;
import org.mazz.restroservice.entity.TableMast;
import org.mazz.restroservice.entity.UserMast;
import org.mazz.restroservice.entity.WaiterMast;
import org.mazz.restroservice.exception.ResourceNotFoundException;
import org.mazz.restroservice.repository.ItemMasterRepository;
import org.mazz.restroservice.repository.KotDetailsRepository;
import org.mazz.restroservice.repository.NumberMasterRepository;
import org.mazz.restroservice.repository.PosMasterRepository;
import org.mazz.restroservice.repository.RateMasterRepository;
import org.mazz.restroservice.repository.TableMasterRepository;
import org.mazz.restroservice.repository.UserMasterRepository;
import org.mazz.restroservice.repository.WaiterMasterRepository;
import org.mazz.restroservice.service.KotDetailsService;
import org.mazz.restroservice.service.TableMasterService;
import org.mazz.restroservice.service.UserMasterService;
import org.mazz.restroservice.service.UserMasterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MobController {
	@Autowired
	private UserMasterRepository userMasterRepository;

	@Autowired
	private PosMasterRepository posMasterRepository;
	@Autowired
	private WaiterMasterRepository waiterMasterRepository;
	@Autowired
	private TableMasterRepository tableMasterRepository;
	@Autowired
	private ItemMasterRepository itemMasterRepository;
	@Autowired
	private RateMasterRepository rateMasterRepository;

	@Autowired
	private KotDetailsRepository kotDetailsRepository;
	
	@Autowired
	private NumberMasterRepository numberMasterRepository;

	@Autowired
	private UserMasterService userMasterService;

	@Autowired
	private TableMasterService tableMasterService;
	@Autowired
	private KotDetailsService kotDetailsService;

	@GetMapping("/connectionCheck")
	public List<String> getconnection() {
		List<String> li = new ArrayList<String>();
		li.add("Server is Connected");
		return li;
	}

	/**
	 * Get all users list.
	 *
	 * @return the list
	 */
	@GetMapping("/userMasterList")
	public List<UserMast> getAllUsers() {
		return userMasterRepository.findAll();
	}

	@PostMapping("/userValid")
	public ResponseEntity<UserMast> userValidation(@RequestBody UserMast user) throws ResourceNotFoundException {

		UserMast validUser = userMasterService.loginValidation(user);
		return ResponseEntity.ok(validUser);
	}

	@GetMapping("/posMasterList")
	public List<PosMast> getPosMasterList() {
		return posMasterRepository.findAll();
	}

	@GetMapping("/waiterMasterList")
	public List<WaiterMast> getWaiterMasterList() {
		return waiterMasterRepository.findAll();
	}

	@GetMapping("/tableWithWaiterList/{posId}")
	public List<TableCustomModal> getTableWithWaiterList(@PathVariable("posId") int posCode) {
		return tableMasterService.getTableWithWaiter(posCode);
	}

	@GetMapping("/itemWithRateList/{posId}/{ItemName}")
	public List<ItemCustomModal> getItemWithRateList(@PathVariable("posId") int posCode,
			@PathVariable("ItemName") String ItemName) {
		return tableMasterService.getItemWithRate(posCode, ItemName);
	}

	@PutMapping("/updateTableStatus/{tableId}")
	public TableCustomModal updateTableStatus(@PathVariable("tableId") int tableId, @RequestBody TableCustomModal tbl) {
		System.out.println("op.." + tbl.toString());
		tableMasterRepository.updateTableMasterStatus(tableId, tbl.getTableStatus(), tbl.getPax(), tbl.getWaiterNo(),
				tbl.getSit());
		return (TableCustomModal) tableMasterService.getTableWithWaiterPosTable(tbl.getPosCode(), tbl.getUnqNo());
	}

	@GetMapping("/tableMasterList")
	public List<TableMast> getTableMasterList() {
		return tableMasterRepository.findAll();
	}

	@GetMapping("/kotDetailList")
	public List<KotDetail> kotDetailList() {
		return kotDetailsRepository.findAll();
	}

	@GetMapping("/itemMasterList")
	public List<ItemMast> getItemMasterList() {
		return itemMasterRepository.findAll();
	}

	@GetMapping("/rateMasterList")
	public List<RateMast> getRateMasterList() {
		return rateMasterRepository.findAll();
	}

	
	
	@GetMapping("/kotDetailListByTable/{unqNo}")
	public List<KotDetailsCustomModal> kotDetailListByTable(@PathVariable("unqNo") int unqNo) {
		System.out.println("unqNo.."+unqNo);
		
		System.out.println("unqNkotDetailsService.getKotDetailsByTable(unqNo)o.."+kotDetailsService.getKotDetailsByTable(unqNo));
		return kotDetailsService.getKotDetailsByTable(unqNo);
	}
	
	@PutMapping("/updateKotDetails/{unqNo}")
	public List<KotDetailsCustomModal> updateKotDetails(@PathVariable("unqNo") int unqNo, @RequestBody List<KotDetail> kots) {
		System.out.println("unqNo.."+unqNo);
		
		kotDetailsRepository.updateKotStatus(unqNo, 1);
	Optional<NumberMaster> numberMaste=numberMasterRepository.getCurrentKotNo(1);
	
	for(KotDetail kot:kots) {
		
	}
	
	kotDetailsRepository.saveAll(kots);
		//System.out.println("kotStatus.."+kotStatus);
		
		return kotDetailsService.getKotDetailsByTable(unqNo);
	}

//  /**
//   * Gets users by id.
//   *
//   * @param userId the user id
//   * @return the users by id
//   * @throws ResourceNotFoundException the resource not found exception
//   */
//  @GetMapping("/{id}")
//  public ResponseEntity<UserMasterEntity> getUsersById(@PathVariable(value = "id") Long userId)
//      throws ResourceNotFoundException {
//	  UserMasterEntity user =
//        userMasterRepository
//            .findById(userId)
//            .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));
//    return ResponseEntity.ok().body(user);
//  }
//  
//  
//  @PostMapping("/valid")
//  public ResponseEntity<UserMasterEntity> userValidation( @RequestBody UserMasterEntity user) throws ResourceNotFoundException {
//	  
//	  UserMasterEntity validUser =
//			  userMasterService.loginValidation(user);
//		    return ResponseEntity.ok(validUser);
//  }
//  
//  
// 
//  
//  /**
//   * Create user user.
//   *
//   * @param user the user
//   * @return the user
//   */
//  @PostMapping("")
//  public UserMasterEntity createUser(@Valid @RequestBody UserMasterEntity user) {
//    return userMasterRepository.save(user);
//  }
//  /**
//   * Update user response entity.
//   *
//   * @param userId the user id
//   * @param userDetails the user details
//   * @return the response entity
//   * @throws ResourceNotFoundException the resource not found exception
//   */
//  @PutMapping("/{id}")
//  public ResponseEntity<UserMasterEntity> updateUser(
//      @PathVariable(value = "id") Long userId, @Valid @RequestBody UserMasterEntity userDetails)
//      throws ResourceNotFoundException {
//	  UserMasterEntity user =
//        userMasterRepository
//            .findById(userId)
//            .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));
//    user.setEmail(userDetails.getEmail());
//    user.setLastName(userDetails.getLastName());
//    user.setFirstName(userDetails.getFirstName());
//    user.setUpdatedAt(new Date());
//    final UserMasterEntity updatedUser = userMasterRepository.save(user);
//    return ResponseEntity.ok(updatedUser);
//  }
//  /**
//   * Delete user map.
//   *
//   * @param userId the user id
//   * @return the map
//   * @throws Exception the exception
//   */
//  @DeleteMapping("/{id}")
//  public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId) throws Exception {
//	  UserMasterEntity user =
//        userMasterRepository
//            .findById(userId)
//            .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + userId));
//    userMasterRepository.delete(user);
//    Map<String, Boolean> response = new HashMap<>();
//    response.put("deleted", Boolean.TRUE);
//    return response;
//  }
}