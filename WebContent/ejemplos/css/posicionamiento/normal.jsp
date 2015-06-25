<jsp:include page="../../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../../plantillas/nav.jsp"></jsp:include>

<section>
	<h2>Posicionamiento en CSS</h2>
	<article>
		<header>
			<h1>Normal o Static</h1>
		</header>

		<style>
.cnt_article div {
	border: 5px solid green;
	width: 90%;
	margin: 0 auto;
	height: 100px;
	padding: 10px;
	margin-bottom: 5px;
}

.cnt_article a {
	border: 5px solid pink;
}
</style>

		<div class="cnt_article">

			<div>Capa1</div>
			<div>
				Capa2 <a href="#">Enlace1</a> <a href="#">Enlace2</a>
			</div>
			<div>Capa3</div>

		</div>

		<footer> Capitulo 9; pagina 198 </footer>

	</article>
	<article>
		<header>
			<h1>Codigo fuente</h1>
		</header>
		<div class="codigo">
			<ul class="tabs">
				<li><a href="#tab1">HTML</a></li>
				<li><a href="#tab2">CSS</a></li>
				<li><a href="#tab3">JS</a></li>
			</ul>
			<div class="clr"></div>
			<div class="block">
				<div id="tab1">
					<pre><code class="html">
							&lt;div class="cnt_article"&gt;
								&lt;div&gt;Capa1&lt;/div&gt;
									&lt;div&gt;
										Capa2 &lt;a href="#"&gt;Enlace1&lt;/a&gt; &lt;a href="#"&gt;Enlace2&lt;/a&gt;
									&lt;/div&gt;
								&lt;div&gt;Capa3&lt;/div&gt;
							&lt;/div&gt;
					</code></pre>
				</div>
				<div id="tab2">
					<pre><code>
							.cnt_article div {
								border: 5px solid green;
								width: 90%;
								margin: 0 auto;
								height: 100px;
								padding: 10px;
								margin-bottom: 5px;
							}
							
							.cnt_article a {
								border: 5px solid pink;
							}
					</code></pre>
				</div>
				<div id="tab3">
					<pre><code>
						$('ul.tabs li:first').addClass('active');
						$('.block div').hide();
						$('.block div:first').show();
						$('ul.tabs li').on('click', function() {
							$('ul.tabs li').removeClass('active');
							$(this).addClass('active')
							$('.block div').hide();
							var activeTab = $(this).find('a').attr('href');
							$(activeTab).show();
							return false;
						})
					</code></pre>
				</div>
			</div>

		</div>
	</article>
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>