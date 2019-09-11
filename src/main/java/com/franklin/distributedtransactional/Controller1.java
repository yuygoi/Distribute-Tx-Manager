package com.franklin.distributedtransactional;

import com.franklin.transaction.annotation.DistributeTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Kirby
 * @date 2019/9/10 0010 14:06
 */
@Controller
@CrossOrigin
public class Controller1 {

    @Autowired
    private Tx2Dao tx2Dao;

    @GetMapping("/test1")
    @Transactional
    @DistributeTransactional(end = true)
    @ResponseBody
    public Object test1(){
        Tx2 tx2 = new Tx2();
        tx2.setId(1);
        tx2Dao.save();
        return "ok";
    }
}
