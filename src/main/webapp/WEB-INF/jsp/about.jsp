<%@include file="header.jsp"%>

<!-- Page Header -->
<!-- Set your background image for this header on the line below. -->
<header class="intro-header" style="background-image: url('https://blog.homeexchange.com/wp-content/uploads/2013/12/cropped-HE-Blog-v04-banner-01.jpg')">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-heading">
                    <h1>About Blog</h1>
                    <hr class="small">
                    <span class="meta">Posted by <a href="#">Junhui Cho</a></span>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- Main Content -->
<article>
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                This is My private blog and this blog is mainly about gaming entertainment and my personal opinions on various topics. Most of the blog posts are based on my own personal experiences or views, so if you have any comments, please contact me (junhuicho8@gmail.com) or leave comments below.
            </div>
        </div>
    </div>
</article>

<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1" style="margin-top: 40px;">
    <div id="disqus_thread"></div>
    <script>



        /*

         *  RECOMMENDED CONFIGURATION VARIABLES: EDIT AND UNCOMMENT THE SECTION BELOW TO INSERT DYNAMIC VALUES FROM YOUR PLATFORM OR CMS.

         *  LEARN WHY DEFINING THESE VARIABLES IS IMPORTANT: https://disqus.com/admin/universalcode/#configuration-variables */

        /*

         var disqus_config = function () {

         this.page.url = PAGE_URL;  // Replace PAGE_URL with your page's canonical URL variable

         this.page.identifier = PAGE_IDENTIFIER; // Replace PAGE_IDENTIFIER with your page's unique identifier variable

         };

         */

        (function() { // DON'T EDIT BELOW THIS LINE

            var d = document, s = d.createElement('script');

            s.src = 'https://junhui-blog.disqus.com/embed.js';

            s.setAttribute('data-timestamp', +new Date());

            (d.head || d.body).appendChild(s);

        })();

    </script>

    <noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>

<%@include file="footer.jsp"%>
