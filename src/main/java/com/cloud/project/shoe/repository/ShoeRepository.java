package com.cloud.project.shoe.repository;

import com.cloud.project.shoe.entity.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ShoeRepository extends JpaRepository<Shoe, Integer>, JpaSpecificationExecutor<Shoe> {
}
