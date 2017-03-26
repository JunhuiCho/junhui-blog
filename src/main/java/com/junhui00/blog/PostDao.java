package com.junhui00.blog;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by BonE on 2017. 2. 26..
 */
public interface PostDao extends JpaRepository<Post, Integer> {
}
