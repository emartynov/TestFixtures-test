package cz.skywall.multimoduleexample.core.mapper

import org.junit.Test
import cz.skywall.multimoduleexample.database.UserDBFixtures
// kotlin is not supported yet
//import cz.skywall.multimoduleexample.database.UserDBKotlinFixtures

class UserMapperKtTest {
    @Test
    fun `Some test`() {
        val user = UserDBFixtures.defaultUser
//        kotlin is not supported yet
//        val kotlinUser = UserDBKotlinFixtures.defaultUser
    }
}