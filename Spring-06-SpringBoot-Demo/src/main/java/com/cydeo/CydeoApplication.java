package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;




@SpringBootApplication
public class CydeoApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(CydeoApplication.class, args);
//    }

//    Comment comment=new Comment();



    public static void main(String[] args) {

        Comment comment=new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context=SpringApplication.run(CydeoApplication.class, args);

        CommentService cs1=context.getBean(CommentService.class);
        CommentService cs2=context.getBean(CommentService.class);

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1==cs2);
    }




}
