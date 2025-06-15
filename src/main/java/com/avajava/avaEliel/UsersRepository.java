package com.avajava.avaEliel;

import com.avajava.avaEliel.enums.RolesEnum;
import com.avajava.avaEliel.models.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByEmail(String email);

    boolean existsByEmail(String email);

    List<Users> findByActiveTrue();

    List<Users> findByRole(RolesEnum role);

    Page<Users> findByActiveTrue(Pageable pageable);

    @Query("SELECT u FROM User u WHERE u.active = true AND " +
            "(LOWER(u.name) LIKE LOWER(CONCAT('%', :search, '%')) OR " +
            "LOWER(u.email) LIKE LOWER(CONCAT('%', :search, '%')))")
    Page<Users> findActiveUsersWithSearch(@Param("search") String search, Pageable pageable);

    @Query("SELECT COUNT(u) FROM User u WHERE u.role = :role AND u.active = true")
    long countByRoleAndActiveTrue(@Param("rolesEnum") RolesEnum roleUsers);
}