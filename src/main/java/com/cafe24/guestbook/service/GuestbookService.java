package com.cafe24.guestbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.guestbook.domain.Guestbook;
import com.cafe24.guestbook.repository.GuestbookRepository;

@Service
@Transactional //Service Layer에 것이 바람직.
public class GuestbookService {
	@Autowired
	private GuestbookRepository guestbookRepository;
	
	public List<Guestbook> getMessageList(){
		return guestbookRepository.findAll();
	}
	
	public void insertMessage( Guestbook guestbook ) {
		guestbookRepository.save( guestbook );
	}
	
	public void deleteMessage ( Guestbook guestbook ) {
		guestbookRepository.remove( guestbook );
	}
}
