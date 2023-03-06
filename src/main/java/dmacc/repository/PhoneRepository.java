/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Mar 5, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {}
