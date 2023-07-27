package edu.global.emp;

import java.util.List;

import edu.global.emp.dao.EmpDao;
import edu.global.emp.dto.EmpDto;

public class EmpMain {
	
	public static void main(String[] arg) {
		EmpDao dao = new EmpDao();
		
		List<EmpDto> emps = dao.getEmps();
		
		for (EmpDto emp : emps) {
			System.out.println("사원번호" + emp.getEmpno());
			System.out.println("사원이름" + emp.getEname());
			System.out.println("직업" + emp.getJob());
			System.out.print("매니저" + emp.getMgr());
			System.out.print("날짜" + emp.getHiredate());
			System.out.print("급여" + emp.getSal());
			System.out.print("상여" + emp.getComm());
			System.out.println("부서번호" + emp.getDeptno());
		}
	}

}
