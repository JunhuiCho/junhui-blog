<%@include file="./header.jsp" %>
<!-- Main Content -->
<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">

            <c:forEach var="post" items="${postList}">
                <div class="post-preview">
                    <a href="/post/${post.id}">
                        <h2 class="post-title">
                                ${post.title}
                        </h2>
                    </a>
                    <p class="post-meta">Posted by <a href="#">Junhui Cho</a> on <fmt:formatDate value="${post.reg_date}" pattern="yyyy-MM-dd" /></p>
                </div>
                <hr>
            </c:forEach>

            <!-- Pager -->
            <ul class="pager">
                <li class="next">
                    <a href="#">Older Posts &rarr;</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<%@include file="./footer.jsp" %>
