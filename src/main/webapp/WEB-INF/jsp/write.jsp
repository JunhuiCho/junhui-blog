<%@include file="header.jsp"%>

    <!-- Page Header -->
    <!-- Set your background image for this header on the line below. -->
    <header class="intro-header" style="background-image: url('https://blog.homeexchange.com/wp-content/uploads/2013/12/cropped-HE-Blog-v04-banner-01.jpg')">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <div class="site-heading">
                        <h1>Write a post</h1>
                        <hr class="small">
                        <span class="subheading">Junhui's Casual Blog</span>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <form action="/post/writePost" method="post" class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
        <div style="width: 80%; margin:auto;">
            <h1>Title</h1>
            <input type="text" name="title" class="form-control">
            <h1>Content</h1>
            <textarea name="content" class="form-control" rows="20"></textarea>
            <br>
            <input type="submit" value="submit" class="btn btn-primary">
        </div>
    </form>

<%@include file="footer.jsp"%>
