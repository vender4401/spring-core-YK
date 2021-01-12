package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	// sql 문을 직접 작성
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	// sql 문을 .xml파일에 담아서 사용
	public String getTime2();	
}

// 클래스 로딩
// 커넥션 열고
// statement 얻고
// query 실행

//SELECT sysdate FROM dual

// resultSet 처리
// 커넥션 닫고

