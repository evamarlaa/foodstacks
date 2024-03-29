package api.foodstacks.service

import api.foodstacks.model.User
import api.foodstacks.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    private val logger = LoggerFactory.getLogger(javaClass)

    fun create(user: User) : User {
        logger.info("action=buildingUser, user=$user")
        return userRepository.save(user)
    }
}
