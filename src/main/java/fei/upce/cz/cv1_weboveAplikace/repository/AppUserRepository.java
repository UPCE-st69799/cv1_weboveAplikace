package fei.upce.cz.cv1_weboveAplikace.repository;

import fei.upce.cz.cv1_weboveAplikace.domain.AppUser;
import fei.upce.cz.cv1_weboveAplikace.domain.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends PagingAndSortingRepository<AppUser, Long> {
    List<AppUser> findAllByActiveEquals(boolean active);

    @Query("""
        select ap
        from AppUser ap
        inner join ap.roles r
        where r = :role
    """) // Using JPQL
    List<AppUser> findAllByRolesContaining(final Role role);
}
