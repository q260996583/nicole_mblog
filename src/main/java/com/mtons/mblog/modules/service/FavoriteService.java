package com.mtons.mblog.modules.service;

import com.mtons.mblog.modules.data.FavoriteVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author langhsu on 2015/8/31.
 */
public interface FavoriteService {
    /**
     *
     * @param userId
     * @param postId
     * @return
     */
    void add(long userId, long postId);
    void delete(long userId, long postId);

    /**
     * 分页查询用户的喜欢记录
     * @param pageable
     * @param ownId
     */
    Page<FavoriteVO> pagingByOwnId(Pageable pageable, long ownId);
}
