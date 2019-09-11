package com.franklin.distributedtransactional;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;

/**
 * @author Kirby
 * @date 2019/9/10 0010 14:06
 */
public interface Tx2Dao extends BaseMapper<Tx2> {
    @Insert("insert into tx2 VALUES(`id`)")
    void save();
}
