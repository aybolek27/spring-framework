package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    //requirement -- > display all regions in Canada
    List<Region> findByCountry(String country);

    //requirement -- > display all regions in Canada without duplicates
    List<Region> findDistinctByCountry(String country);


    //requirement -- > display all regions with country name includes 'United'
    List<Region> findByCountryContaining(String country);

    //requirement -- > display all regions with country name includes 'United' in order
    List<Region> findByCountryContainingOrderByCountry(String country);

    //requirement -- > display top 2 region in Canada
    List<Region> findTopByCountry(String country);


}
