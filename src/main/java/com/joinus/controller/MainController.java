package com.joinus.controller;

import com.joinus.model.JoinModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joinus.service.JoinService;

@Controller
public class MainController {

@Autowired
private JoinService joinService;


@RequestMapping("/")
public String joinReg()
{
return "joinSave.jsp";
}
@RequestMapping("/AllJoin")
public String all()
{
return "AllJoins.jsp";
}



@RequestMapping("/showJoin")
public String all_joins(ModelMap modelMap)
{
modelMap.put("joins", joinService.findAll());
return "AllJoins.jsp";
}



@RequestMapping("/save-join")
public String  saveJoin(@ModelAttribute JoinModel model)
{
joinService.saveMyUser(model);
return "joinSave.jsp";
}


}
