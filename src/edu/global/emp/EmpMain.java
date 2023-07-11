package edu.global.emp;

import java.util.List;

import edu.global.emp.dao.EmpDao;
import edu.global.emp.dto.EmpDto;

public class EmpMain {
	
	public static void main(String[] arg) {
		EmpDao dao = new EmpDao();
		
		List<EmpDto> emps = dao.getEmps();
		
		for (EmpDto emp : emps) {
			System.out.print("사원번호" + emp.getEmpno() + '\t');
			System.out.print("사원이름" + emp.getEname() + '\t');
			System.out.print("직업" + emp.getJob() + '\t');
			System.out.print("매니저" + emp.getMgr() + '\t');
			System.out.print("날짜" + emp.getHiredate() + '\t');
			System.out.print("급여" + emp.getSal() + '\t');
			System.out.print("상여" + emp.getComm() + '\t');
			System.out.println("부서번호" + emp.getDeptno() + '\t');

		}
	}

}
