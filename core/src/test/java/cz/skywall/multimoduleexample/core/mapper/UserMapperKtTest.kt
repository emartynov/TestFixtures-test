package cz.skywall.multimoduleexample.core.mapper

import org.junit.Test
// java works fine
import cz.skywall.multimoduleexample.database.UserDBJavaFixtures
// kotlin is not supported in gradle run yet
//import cz.skywall.multimoduleexample.database.UserDBKotlinFixtures

class UserMapperKtTest {
    @Test
    fun `Some test`() {
// java works fine
        val user = UserDBJavaFixtures.defaultUser
// kotlin is not supported in gradle run yet
//        val kotlinUser = UserDBKotlinFixtures.defaultUser
    }
}