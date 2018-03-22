package com.example.demo.dao;

import com.example.demo.shiti.HuiFu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by Administrator on 2018/1/22.
 */
public interface HuiFudao extends JpaRepository<HuiFu,Integer> {
    @Modifying
    @Transactional
    @Query(value = "delete from hui_fu where id = ?1", nativeQuery = true)
    void deleteHuiFuByYongHu(Integer id);


}
