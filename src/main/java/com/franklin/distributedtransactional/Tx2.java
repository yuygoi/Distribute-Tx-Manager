package com.franklin.distributedtransactional;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kirby
 * @date 2019/9/10 0010 14:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tx2")
public class Tx2 {
    @TableId(value = "id" , type = IdType.AUTO)
    private Integer id;
}
