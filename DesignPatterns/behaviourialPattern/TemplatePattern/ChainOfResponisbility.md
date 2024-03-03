# Chain of Responsibility Pattern Examples

The Chain of Responsibility pattern is a behavioral design pattern that allows an object to pass a request along a chain of potential handlers until one of them handles the request.

## Example 1: Using Try-Catch

Suppose we have multiple exception handlers for different types of exceptions in a system. We can use the Chain of Responsibility pattern to handle exceptions in a chain-like manner.

```java
public class ExceptionHandler {
    private ExceptionHandler nextHandler;

    public void setNextHandler(ExceptionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleException(Exception e) {
        try {
            // Try handling the exception
            // If unable to handle, pass it to the next handler
        } catch (SpecificException1 ex) {
            // Handle SpecificException1
        } catch (SpecificException2 ex) {
            // Handle SpecificException2
        }

        if (nextHandler != null) {
            nextHandler.handleException(e);
        }
    }
}

## Example 2: Using Try-Catch

```java
public interface SearchHandler {
    void setNext(SearchHandler handler);
    SearchResult search(String query);
}

public class TextSearchHandler implements SearchHandler {
    private SearchHandler next;

    @Override
    public void setNext(SearchHandler handler) {
        this.next = handler;
    }

    @Override
    public SearchResult search(String query) {
        if (query.contains("text")) {
            // Perform text search
            return new TextSearchResult();
        } else if (next != null) {
            return next.search(query);
        }
        return new NoSearchResult();
    }
}

public class ImageSearchHandler implements SearchHandler {
    private SearchHandler next;

    @Override
    public void setNext(SearchHandler handler) {
        this.next = handler;
    }

    @Override
    public SearchResult search(String query) {
        if (query.contains("image")) {
            // Perform image search
            return new ImageSearchResult();
        } else if (next != null) {
            return next.search(query);
        }
        return new NoSearchResult();
    }
}

public class VideoSearchHandler implements SearchHandler {
    private SearchHandler next;

    @Override
    public void setNext(SearchHandler handler) {
        this.next = handler;
    }

    @Override
    public SearchResult search(String query) {
        if (query.contains("video")) {
            // Perform video search
            return new VideoSearchResult();
        } else if (next != null) {
            return next.search(query);
        }
        return new NoSearchResult();
    }
}

public class NoSearchResult implements SearchResult {
    // Implementation of NoSearchResult
}

// Define TextSearchResult, ImageSearchResult, and VideoSearchResult classes accordingly.
