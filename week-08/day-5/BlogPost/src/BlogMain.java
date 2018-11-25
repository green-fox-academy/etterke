public class BlogMain {

  public static void main(String[] args) {
    BlogPost firstBlogPost = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
    BlogPost secondBlogPost = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost thirdBlogPost = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

    Blog blog = new Blog();
    blog.add(firstBlogPost);
    blog.add(secondBlogPost);
    blog.add(thirdBlogPost);

    System.out.println(blog.toString());
    System.out.println("\n");

    blog.deleteBlogPost(0);

    BlogPost fourthBlogPost = new BlogPost("Eszter Nagy", "This is going to work", "Because it simply has to", "2018.11.25.");

    blog.updateBlogPost(0,fourthBlogPost);

    System.out.println(blog.toString());
  }
}
