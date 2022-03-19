<%--
  Created by IntelliJ IDEA.
  User: 张锦涛
  Date: 2021/11/26
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="com.finoverse.domain.Item" %>
<%@ page import="com.finoverse.dao.impl.ItemDaoImpl" %>
<%@ page import="com.finoverse.dao.ItemDao" %>
<%@ page import="com.finoverse.test.TestDemo" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html style="font-size: 16px;">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta charset="utf-8">
  <meta name="keywords" content="The beauty of nature, the sky, the mountain, the tree..., Unseen beauty, 9 Things You Can Do to Save the Environment, 1, 2, 3, 4, 5, 6, Current projects, Save The World!, Save The World!">
  <meta name="description" content="">
  <meta name="page_type" content="np-template-header-footer-from-plugin">
  <title>Home</title>
  <link rel="stylesheet" href="CSS/nicepage.css" media="screen">
  <link rel="stylesheet" href="Home.css" media="screen">
  <script class="u-script" type="text/javascript" src="JS/jquery.js" defer=""></script>
  <script class="u-script" type="text/javascript" src="JS/nicepage.js" defer=""></script>
  <meta name="generator" content="Nicepage 3.10.2, www.11moban.com">
  <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Merriweather:300,300i,400,400i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
  <script type="application/ld+json">{
    "@context": "http://schema.org",
    "@type": "Organization",
    "name": "",
    "url": "index.jsp",
    "sameAs": []
  }</script>
  <meta property="og:title" content="Home">
  <meta property="og:type" content="website">
  <meta name="theme-color" content="#81c132">
  <link rel="canonical" href="index.jsp">
  <meta property="og:url" content="index.jsp">
</head>
<body class="u-body"><header class="u-black u-clearfix u-header u-header" id="sec-5d34"><div class="u-align-left u-clearfix u-sheet u-sheet-1">
  <h3 class="u-align-left-xs u-headline u-text u-text-1">
    <a href="/">Multispectral images factory</a>
  </h3>
  <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-1" data-responsive-from="XL">
    <div class="menu-collapse">
      <a class="u-button-style u-nav-link u-text-body-alt-color" href="#" style="padding: 8px 0px;">
        <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 302 302" style="undefined"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-a760"></use></svg>
        <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="svg-a760" x="0px" y="0px" viewBox="0 0 302 302" style="enable-background:new 0 0 302 302;" xml:space="preserve" class="u-svg-content"><g><rect y="36" width="302" height="30"></rect><rect y="236" width="302" height="30"></rect><rect y="136" width="302" height="30"></rect>
        </g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g></svg>
      </a>
    </div>
    <div class="u-nav-container">
      <ul class="u-nav u-spacing-25 u-unstyled"><li class="u-nav-item"><a class="u-btn-text u-button-style u-nav-link" href="index.jsp" style="padding: 8px 0px;">Home</a>
      </li><li class="u-nav-item"><a class="u-btn-text u-button-style u-nav-link" href="Display.jsp" style="padding: 8px 0px;">Display</a>
      </li><li class="u-nav-item"><a class="u-btn-text u-button-style u-nav-link" href="Database.jsp" style="padding: 8px 0px;">Database</a>
      </li></ul>
    </div>
    <div class="u-nav-container-collapse">
      <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
        <div class="u-sidenav-overflow">
          <div class="u-menu-close"></div>
          <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-btn-text u-button-style u-nav-link" href="Home.html" style="padding: 8px 0px;">Home</a>
          </li><li class="u-nav-item"><a class="u-btn-text u-button-style u-nav-link" href="Display.jsp" style="padding: 8px 0px;">Display</a>
          </li><li class="u-nav-item"><a class="u-btn-text u-button-style u-nav-link" href="Database.jsp" style="padding: 8px 0px;">Database</a>
          </li></ul>
        </div>
      </div>
      <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
    </div>
  </nav>
</div></header>
<section class="u-clearfix u-image u-shading u-section-1" id="sec-eca5">
  <div class="u-clearfix u-sheet u-sheet-1">
    <div class="u-container-style u-expanded-width-sm u-expanded-width-xs u-group u-opacity u-opacity-15 u-palette-1-base u-group-1">
      <div class="u-container-layout u-container-layout-1">
        <p class="u-align-center u-text u-text-1">多光谱图像多时相处理技术</p>
        <div class="u-border-3 u-border-white u-shape u-shape-bottom u-shape-left u-shape-1"></div>
        <h1 class="u-align-center u-text u-text-body-alt-color u-title u-text-2">文物本征变化监测</h1>
        <a href="Display.jsp" class="u-border-1 u-border-palette-1-base u-btn u-button-style u-palette-1-base u-btn-1">read more</a>
        <div class="u-border-3 u-border-white u-shape u-shape-right u-shape-top u-shape-2"></div>
      </div>
    </div>
  </div>
</section>
<section class="u-clearfix u-section-2" id="sec-6e7c">
  <div class="u-clearfix u-sheet u-sheet-1">
    <img src="images/532978.jpg" alt="" class="u-align-left u-expanded-width-xs u-image u-left-0 u-image-1">
    <img src="images/287261.jpg" alt="" class="u-align-left u-image u-right-0 u-image-2">
    <div class="u-align-left u-container-style u-expanded-width-sm u-expanded-width-xs u-group u-right-0 u-group-1">
      <div class="u-container-layout u-valign-middle u-container-layout-1">
        <h2 class="u-text u-text-1">多光谱技术(Multispectral)</h2>
        <div class="u-border-3 u-border-palette-1-base u-line u-line-horizontal u-line-1"></div>
        <p class="u-text u-text-2">是指能同时获取多个光学频谱波段（通常大于等于3个），并在可见光的基础上向红外光和紫外光两个方向扩展的光谱探测技术。常见实现方法是通过各种滤光片或分光器与多种感光胶片的组合，使其在同一时刻分别接收同一目标在不同窄光谱波段范围内辐射或反射的光信号，得到目标在几张不同光谱带的照片。</p>
      </div>
    </div>
    <div class="u-container-style u-expanded-width-xs u-group u-group-2">
      <div class="u-container-layout u-valign-middle-lg u-valign-middle-xl u-container-layout-2"><span class="u-icon u-icon-circle u-text-grey-10 u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 95.333 95.332" style="undefined"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-dd14"></use></svg><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="svg-dd14" x="0px" y="0px" viewBox="0 0 95.333 95.332" style="enable-background:new 0 0 95.333 95.332;" xml:space="preserve" class="u-svg-content"><g><g><path d="M30.512,43.939c-2.348-0.676-4.696-1.019-6.98-1.019c-3.527,0-6.47,0.806-8.752,1.793    c2.2-8.054,7.485-21.951,18.013-23.516c0.975-0.145,1.774-0.85,2.04-1.799l2.301-8.23c0.194-0.696,0.079-1.441-0.318-2.045    s-1.035-1.007-1.75-1.105c-0.777-0.106-1.569-0.16-2.354-0.16c-12.637,0-25.152,13.19-30.433,32.076    c-3.1,11.08-4.009,27.738,3.627,38.223c4.273,5.867,10.507,9,18.529,9.313c0.033,0.001,0.065,0.002,0.098,0.002    c9.898,0,18.675-6.666,21.345-16.209c1.595-5.705,0.874-11.688-2.032-16.851C40.971,49.307,36.236,45.586,30.512,43.939z"></path><path d="M92.471,54.413c-2.875-5.106-7.61-8.827-13.334-10.474c-2.348-0.676-4.696-1.019-6.979-1.019    c-3.527,0-6.471,0.806-8.753,1.793c2.2-8.054,7.485-21.951,18.014-23.516c0.975-0.145,1.773-0.85,2.04-1.799l2.301-8.23    c0.194-0.696,0.079-1.441-0.318-2.045c-0.396-0.604-1.034-1.007-1.75-1.105c-0.776-0.106-1.568-0.16-2.354-0.16    c-12.637,0-25.152,13.19-30.434,32.076c-3.099,11.08-4.008,27.738,3.629,38.225c4.272,5.866,10.507,9,18.528,9.312    c0.033,0.001,0.065,0.002,0.099,0.002c9.897,0,18.675-6.666,21.345-16.209C96.098,65.559,95.376,59.575,92.471,54.413z"></path>
</g>
</g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g></svg></span>
        <h4 class="u-text u-text-3">文物表面精准像元分析</h4>
      </div>
    </div>
    <div class="u-align-left u-container-style u-expanded-width-xs u-grey-5 u-group u-group-3">
      <div class="u-container-layout u-valign-middle-lg u-container-layout-3">
        <h2 class="u-text u-text-4">像素级别变化监测</h2>
        <div class="u-border-3 u-border-palette-1-base u-line u-line-horizontal u-line-2"></div>
        <p class="u-text u-text-5">图像配准与辐射校正是变化监测的两项关键过程，处理精度将直接影响变化监测的性能。图像差异的监测使用了差分纹理变换检测处理方案，实现高效精准识别。</p>
      </div>
    </div>
  </div>
</section>


<footer class="u-clearfix u-footer u-palette-2-dark-3" id="sec-434c"><div class="u-clearfix u-sheet u-sheet-1">
  <p class="u-align-center u-text u-text-1">文物承载灿烂文明，维系民族精神，是老祖宗留下的宝贵遗产，是加强社会主义精神文明建设的深厚滋养。保护文物功在当代、利在千秋。</p>
  <div class="u-border-1 u-border-white u-expanded-width u-line u-line-horizontal u-opacity u-opacity-50 u-line-1"></div>
  <div class="u-align-left u-social-icons u-spacing-10 u-social-icons-1">
    <a class="u-social-url" target="_blank" href=""><span class="u-icon u-icon-circle u-social-facebook u-social-icon u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112.2 112.2" style="undefined"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-47ca"></use></svg><svg x="0px" y="0px" viewBox="0 0 112.2 112.2" enable-background="new 0 0 112.2 112.2" xml:space="preserve" id="svg-47ca" class="u-svg-content"><path d="M75.5,28.8H65.4c-1.5,0-4,0.9-4,4.3v9.4h13.9l-1.5,15.8H61.4v45.1H42.8V58.3h-8.8V42.4h8.8V32.2 c0-7.4,3.4-18.8,18.8-18.8h13.8v15.4H75.5z"></path></svg></span>
    </a>
    <a class="u-social-url" target="_blank" href=""><span class="u-icon u-icon-circle u-social-icon u-social-twitter u-icon-2"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112.2 112.2" style="undefined"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-9557"></use></svg><svg x="0px" y="0px" viewBox="0 0 112.2 112.2" enable-background="new 0 0 112.2 112.2" xml:space="preserve" id="svg-9557" class="u-svg-content"><path d="M92.2,38.2c0,0.8,0,1.6,0,2.3c0,24.3-18.6,52.4-52.6,52.4c-10.6,0.1-20.2-2.9-28.5-8.2 c1.4,0.2,2.9,0.2,4.4,0.2c8.7,0,16.7-2.9,23-7.9c-8.1-0.2-14.9-5.5-17.3-12.8c1.1,0.2,2.4,0.2,3.4,0.2c1.6,0,3.3-0.2,4.8-0.7 c-8.4-1.6-14.9-9.2-14.9-18c0-0.2,0-0.2,0-0.2c2.5,1.4,5.4,2.2,8.4,2.3c-5-3.3-8.3-8.9-8.3-15.4c0-3.4,1-6.5,2.5-9.2 c9.1,11.1,22.7,18.5,38,19.2c-0.2-1.4-0.4-2.8-0.4-4.3c0.1-10,8.3-18.2,18.5-18.2c5.4,0,10.1,2.2,13.5,5.7c4.3-0.8,8.1-2.3,11.7-4.5 c-1.4,4.3-4.3,7.9-8.1,10.1c3.7-0.4,7.3-1.4,10.6-2.9C98.9,32.3,95.7,35.5,92.2,38.2z"></path></svg></span>
    </a>
    <a class="u-social-url" target="_blank" href=""><span class="u-icon u-icon-circle u-social-icon u-social-instagram u-icon-3"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112.2 112.2" style="undefined"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-ed4e"></use></svg><svg x="0px" y="0px" viewBox="0 0 112.2 112.2" enable-background="new 0 0 112.2 112.2" xml:space="preserve" id="svg-ed4e" class="u-svg-content"><path d="M55.9,32.9c-12.8,0-23.2,10.4-23.2,23.2s10.4,23.2,23.2,23.2s23.2-10.4,23.2-23.2S68.7,32.9,55.9,32.9z M55.9,69.4c-7.4,0-13.3-6-13.3-13.3c-0.1-7.4,6-13.3,13.3-13.3s13.3,6,13.3,13.3C69.3,63.5,63.3,69.4,55.9,69.4z"></path><path d="M79.7,26.8c-3,0-5.4,2.5-5.4,5.4s2.5,5.4,5.4,5.4c3,0,5.4-2.5,5.4-5.4S82.7,26.8,79.7,26.8z"></path><path d="M78.2,11H33.5C21,11,10.8,21.3,10.8,33.7v44.7c0,12.6,10.2,22.8,22.7,22.8h44.7c12.6,0,22.7-10.2,22.7-22.7 V33.7C100.8,21.1,90.6,11,78.2,11z M91,78.4c0,7.1-5.8,12.8-12.8,12.8H33.5c-7.1,0-12.8-5.8-12.8-12.8V33.7 c0-7.1,5.8-12.8,12.8-12.8h44.7c7.1,0,12.8,5.8,12.8,12.8V78.4z"></path></svg></span>
    </a>
    <a class="u-social-url" target="_blank" href=""><span class="u-icon u-icon-circle u-social-icon u-social-linkedin u-icon-4"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112.2 112.2" style="undefined"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-2d77"></use></svg><svg x="0px" y="0px" viewBox="0 0 112.2 112.2" enable-background="new 0 0 112.2 112.2" xml:space="preserve" id="svg-2d77" class="u-svg-content"><path d="M33.8,96.8H14.5v-58h19.3V96.8z M24.1,30.9L24.1,30.9c-6.6,0-10.8-4.5-10.8-10.1c0-5.8,4.3-10.1,10.9-10.1 S34.9,15,35.1,20.8C35.1,26.4,30.8,30.9,24.1,30.9z M103.3,96.8H84.1v-31c0-7.8-2.7-13.1-9.8-13.1c-5.3,0-8.5,3.6-9.9,7.1 c-0.6,1.3-0.6,3-0.6,4.8V97H44.5c0,0,0.3-52.6,0-58h19.3v8.2c2.6-3.9,7.2-9.6,17.4-9.6c12.7,0,22.2,8.4,22.2,26.1V96.8z"></path></svg></span>
    </a>
  </div>
</div></footer>
<section class="u-backlink u-clearfix u-grey-80">
  <a class="u-link">
    <span>Website Mockup</span>
  </a>
  <p class="u-text">
    <span>created with</span>
  </p>
  <a class="u-link">
    <span>Jintao Zhang</span>
  </a>.
</section>
</body>
</html>