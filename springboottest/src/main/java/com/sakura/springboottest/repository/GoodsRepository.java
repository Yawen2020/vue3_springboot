package com.sakura.springboottest.repository;

import com.sakura.springboottest.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
}
