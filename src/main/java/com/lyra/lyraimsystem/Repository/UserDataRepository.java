package com.lyra.lyraimsystem.Repository;

import com.lyra.lyraimsystem.domain.entity.UserData;
import com.lyra.lyraimsystem.domain.entity.UserDataId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends CrudRepository<UserData, UserDataId>, PagingAndSortingRepository<UserData, UserDataId> {
    UserData findByUserIdAndAppId(Long userId, Long appId);
    UserData findByUserId(Long userId);
}
