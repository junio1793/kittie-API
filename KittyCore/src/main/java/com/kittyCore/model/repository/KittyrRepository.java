package com.kittyCore.model.repository;

import com.kittyCore.model.kittymodel.KittyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KittyrRepository extends JpaRepository<KittyModel,Long> {
}
