
package com.zihan.demo.dao;

import com.zihan.demo.model.Video;
import org.springframework.stereotype.Repository;

/**
 * Created by zihanxu on 2017/9/14.
 */
@Repository
public interface VideoDAO {
    public Video getVideoById(Long videoId);
}
