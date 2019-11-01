package com.hgd.sbdb.Controller;

import com.hgd.sbdb.entities.Department;
import com.hgd.sbdb.entities.Employee;
import com.hgd.sbdb.mapper.DepartmentMapper;
import com.hgd.sbdb.mapper.EmployeeMapper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @program: demo
 * @description:
 * @author: wzh
 * @create: 2019-10-31 20:56
 **/
@Controller
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("/")
    public String toLoginPage(){
        return "login";
    }

    //查询所有员工
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeMapper.getAllEmployee();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    //跳转到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //先查询出所有的部门
        Collection<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("depts", departments);
        System.out.println(departments);
        return "emp/add";
    }

    //员工添加
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        employeeMapper.saveEmplyee(employee.getLastName(), employee.getGender(), employee.getEmail(),
                employee.getDepartment(), employee.getBirth());
        return "redirect:/emps";
    }

    //修改跳转
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeMapper.getEmployeeById(id);
        model.addAttribute("emp", employee);
        //查询出所有的部门
        Collection<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("depts", departments);
        System.out.println("修改"+departments);
        //回到修改页面
        return "emp/add";
    }

    //修改提交
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        employeeMapper.updateEmployee(employee.getId(), employee.getLastName(), employee.getGender(), employee.getEmail(),
                employee.getDepartment(), employee.getBirth());
        System.out.println("修改:"+employee.getId()+employee.getDepartment());
        return "redirect:/emps";
    }

    //员工删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeMapper.deleteEmployee(id);
        return "redirect:/emps";
    }
}
