import java.util.ArrayList;

public class Blog {

  private ArrayList<BlogPost> blog;

  public Blog() {
    blog = new ArrayList<>();
  }

  public void add(BlogPost blogPost) {
    this.blog.add(blogPost);
  }

  public void deleteBlogPost(int indexNumber) {
    this.blog.remove(blog.get(indexNumber));
  }

  public void updateBlogPost(int indexNumber, BlogPost blog) {
    this.blog.set(indexNumber, blog);
  }

  public ArrayList<BlogPost> getBlog() {
    return blog;
  }

  public void setBlog(ArrayList<BlogPost> blog) {
    this.blog = blog;
  }

  @Override
  public String toString() {
    return "Blog{" +
        "blog=" + blog +
        '}';
  }
}

