package Blog;

import BlogPost.BlogPost;

import java.util.ArrayList;
import java.util.List;

/*
Blog
Reuse your BlogPost class
Create a Blog class which can
store a list of BlogPosts
add BlogPosts to the list
delete(int) one item at given index
update(int, BlogPost) one item at the given index and update it with another BlogPost
 */
public class Blog {
    List<BlogPost> myBlog = new ArrayList<>();

    public void addBlogPost(BlogPost addedBlogPost){
        myBlog.add(addedBlogPost);
    }
    public void delete(int a){
        myBlog.remove(a);
    }
    public void update(int b, BlogPost addedBlogPost){
        myBlog.set(b,addedBlogPost);
    }
}
