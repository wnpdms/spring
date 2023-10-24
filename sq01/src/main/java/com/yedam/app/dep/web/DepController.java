package com.yedam.app.dep.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.app.dep.service.DepService;
import com.yedam.app.dep.service.DepVO;

@Controller
public class DepController {
	
	@Autowired
	DepService depService;
	
	//전체조회
	@GetMapping("depList")
	public String getDepList(Model model) {
		List<DepVO> list = depService.getDepAll();
		model.addAttribute("depList", list);
		return "dep/depList";
	}
	
	// 사원조회
	@GetMapping("depInfo")
	public String getDepInfo(DepVO depVO, Model model) {
		DepVO findVO = depService.getDepInfo(depVO);
		model.addAttribute("depInfo", findVO);
		return "dep/depInfo";
	}
	
	// 등록 Form
	@GetMapping("depInsert")
	public String insertDepInfoForm() {
		return "dep/depInsert";		
	}
	
	// 등록 Process
	@PostMapping("depInsert")
	public String insertDepInfoProcess(DepVO depVO) {
		int depId = depService.insertDepInfo(depVO);
		
		String path = null;
		if(depId > -1) {
			path = "redirect:depInfo?departmentId=" + depId;
		}else {
			path = "redirect:depList";		
		}
		return path;
	}

}
