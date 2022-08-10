package com.springbook.biz;

import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

public class BoardServiceClient {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml"); // 싱글톤 패턴임
		
		BoardService boardService = (BoardService)container.getBean("bo"
				+ "ardService");
		
		BoardVO vo = new BoardVO();
		
//		vo.setTitle("수정제목");
//		vo.setWriter("고길동");
//		vo.setContent("수정내용");
//		vo.setSeq(1);
		
//		System.out.println(vo.getTitle());
//		System.out.println(vo.getWriter());
//		System.out.println(vo.getContent());
//		boardService.insertBoard(vo);
//		System.out.println("업데이트 전");
//		boardService.updateBoard(vo);
//		System.out.println("업데이트됨?");
		
//		List<BoardVO> list = boardService.getBoardList();
//	      for(BoardVO list2 : list) {
//	         System.out.println(list2.toString());
//	      }
	      
//	    BoardVO bvo = boardService.getBoard(vo);
//	    System.out.println(bvo.toString());
	    
	    
//	    boardService.deleteBoard(vo);
//	    System.out.println("삭제되었냐");
		
	    vo.setSeq(1);
	    
	    boardService.getBoard(vo);
	    System.out.println("1명조회");
	    
		container.close();
	}

}
