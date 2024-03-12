package com.it.controller;


import com.it.pojo.Book;
import com.it.pojo.User;
import org.springframework.web.bind.annotation.*;

/***
 * Rest风格简化开发
 *
 * 其中注解 @RestController包含了@Controller和 #ResponseBody
 */
@RestController
@RequestMapping("/books")
public class BookConreoller {

    @GetMapping("/{id}")
    public String SelectBook(@PathVariable  int id){
        System.out.println("select ...."+id);
        return "依靠id查询成功";
    }

    @PutMapping("/book")
    public String putuser(@RequestBody Book book){
        System.out.println("保存  book....");
        return book.toString();
    }
}
