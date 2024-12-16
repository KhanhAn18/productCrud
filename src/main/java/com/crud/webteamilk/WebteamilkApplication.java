package com.crud.webteamilk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.webteamilk.entity.BubbleTea;
import com.crud.webteamilk.service.BubbleTeaService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class WebteamilkApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(WebteamilkApplication.class, args);
	}

	private final BubbleTeaService bubbleTeaService;

	@Override
	public void run(String... args) throws Exception {
		BubbleTea bubbleTea1 = BubbleTea.builder()
			.name("Trà sữa dâu")
			.description("Trà sữa thơm ngon với vị dâu")
			.price(100)
			.size("Lớn")
			.topping("dâu")
			.imageUrl("https://posapp.vn/wp-content/uploads/2018/03/tra-sua-vi-dau.jpg")
			.build();
			
		BubbleTea bubbleTea2 = BubbleTea.builder()
			.name("Trà sữa truyền thống")
			.description("Trà sữa thơm ngon đặc trưng quê nhà")
			.price(80)
			.size("Vừa")
			.topping("Trân châu")
			.imageUrl("https://th.bing.com/th/id/OIP.3miUURNwBEawNAwsIV-bbAHaHa?w=800&h=800&rs=1&pid=ImgDetMain")
			.build();
			
		bubbleTeaService.addBubbleTea(bubbleTea1);	
		bubbleTeaService.addBubbleTea(bubbleTea2);	
	}
}
