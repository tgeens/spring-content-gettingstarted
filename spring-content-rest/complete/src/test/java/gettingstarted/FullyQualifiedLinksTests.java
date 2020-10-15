package gettingstarted;

import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = {
        "spring.content.rest.fullyQualifiedLinks=true"
})
public class FullyQualifiedLinksTests extends GettingStartedTest {

}
