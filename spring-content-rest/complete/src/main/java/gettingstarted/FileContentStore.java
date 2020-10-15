package gettingstarted;

import org.springframework.content.commons.repository.ContentStore;

import org.springframework.content.rest.StoreRestResource;

// linkRel = "content" so we can easily test fullyQualifiedLinks = true|false
@StoreRestResource(linkRel = "content")
public interface FileContentStore extends ContentStore<File, String> {
}
