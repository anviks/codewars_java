<p>The purpose of this kata is to write a program that can do some algebra.</p>
<p>Write a function <code>expand</code> that takes in an expression with a single, one character variable, and expands it. The expression is in the form <code>(ax+b)^n</code> where <code>a</code> and <code>b</code> are integers which may be positive or negative, <code>x</code> is any single character variable, and <code>n</code> is a natural number. If a = 1, no coefficient will be placed in front of the variable. If a = -1, a "-" will be placed in front of the variable. </p>
<p>The expanded form should be returned as a string in the form <code>ax^b+cx^d+ex^f...</code> where <code>a</code>, <code>c</code>, and <code>e</code> are the coefficients of the term, <code>x</code> is the original one character variable that was passed in the original expression and <code>b</code>, <code>d</code>, and <code>f</code>, are the powers that <code>x</code> is being raised to in each term and are in decreasing order.</p>
<p>If the coefficient of a term is zero, the term should not be included. If the coefficient of a term is one, the coefficient should not be included. If the coefficient of a term is -1, only the "-" should be included. If the power of the term is 0, only the coefficient should be included. If the power of the term is 1, the caret and power should be excluded.</p>
<hr>
<h2 id="examples">Examples:</h2>
<pre style="display: none;"><code class="language-javascript"><span class="cm-variable">expand</span>(<span class="cm-string">"(x+1)^2"</span>);      <span class="cm-comment">// returns "x^2+2x+1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(p-1)^3"</span>);      <span class="cm-comment">// returns "p^3-3p^2+3p-1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(2f+4)^6"</span>);     <span class="cm-comment">// returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-2a-4)^0"</span>);    <span class="cm-comment">// returns "1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-12t+43)^2"</span>);  <span class="cm-comment">// returns "144t^2-1032t+1849"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(r+0)^203"</span>);    <span class="cm-comment">// returns "r^203"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-x-1)^2"</span>);     <span class="cm-comment">// returns "x^2+2x+1"</span>
</code></pre>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">expand</span>(<span class="cm-string">"(x+1)^2"</span>)      <span class="cm-comment"># returns "x^2+2x+1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(p-1)^3"</span>)      <span class="cm-comment"># returns "p^3-3p^2+3p-1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(2f+4)^6"</span>)     <span class="cm-comment"># returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-2a-4)^0"</span>)    <span class="cm-comment"># returns "1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-12t+43)^2"</span>)  <span class="cm-comment"># returns "144t^2-1032t+1849"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(r+0)^203"</span>)    <span class="cm-comment"># returns "r^203"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-x-1)^2"</span>)     <span class="cm-comment"># returns "x^2+2x+1"</span>
</code></pre>
<pre><code class="language-java"><span class="cm-variable">KataSolution</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(x+1)^2"</span>);      <span class="cm-comment">// returns "x^2+2x+1"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(p-1)^3"</span>);      <span class="cm-comment">// returns "p^3-3p^2+3p-1"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(2f+4)^6"</span>);     <span class="cm-comment">// returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(-2a-4)^0"</span>);    <span class="cm-comment">// returns "1"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(-12t+43)^2"</span>);  <span class="cm-comment">// returns "144t^2-1032t+1849"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(r+0)^203"</span>);    <span class="cm-comment">// returns "r^203"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(-x-1)^2"</span>);     <span class="cm-comment">// returns "x^2+2x+1"</span>
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-variable">KataSolution</span>.<span class="cm-variable">Expand</span>(<span class="cm-string">"(x+1)^2"</span>);      <span class="cm-comment">// returns "x^2+2x+1"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">Expand</span>(<span class="cm-string">"(p-1)^3"</span>);      <span class="cm-comment">// returns "p^3-3p^2+3p-1"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">Expand</span>(<span class="cm-string">"(2f+4)^6"</span>);     <span class="cm-comment">// returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">Expand</span>(<span class="cm-string">"(-2a-4)^0"</span>);    <span class="cm-comment">// returns "1"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">Expand</span>(<span class="cm-string">"(-12t+43)^2"</span>);  <span class="cm-comment">// returns "144t^2-1032t+1849"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">Expand</span>(<span class="cm-string">"(r+0)^203"</span>);    <span class="cm-comment">// returns "r^203"</span>
<span class="cm-variable">KataSolution</span>.<span class="cm-variable">Expand</span>(<span class="cm-string">"(-x-1)^2"</span>);     <span class="cm-comment">// returns "x^2+2x+1"</span>
</code></pre>
<pre style="display: none;"><code class="language-ruby"><span class="cm-variable">expand</span>(<span class="cm-string">"(x+1)^2"</span>)      <span class="cm-comment"># returns "x^2+2x+1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(p-1)^3"</span>)      <span class="cm-comment"># returns "p^3-3p^2+3p-1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(2f+4)^6"</span>)     <span class="cm-comment"># returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-2a-4)^0"</span>)    <span class="cm-comment"># returns "1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-12t+43)^2"</span>)  <span class="cm-comment"># returns "144t^2-1032t+1849"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(r+0)^203"</span>)    <span class="cm-comment"># returns "r^203"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"(-x-1)^2"</span>)     <span class="cm-comment"># returns "x^2+2x+1"</span>
</code></pre>
<pre style="display: none;"><code class="language-scala"><span class="cm-variable">BinomialExpansion</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(x+1)^2"</span>)      <span class="cm-comment">// returns "x^2+2x+1"</span>
<span class="cm-variable">BinomialExpansion</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(p-1)^3"</span>)      <span class="cm-comment">// returns "p^3-3p^2+3p-1"</span>
<span class="cm-variable">BinomialExpansion</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(2f+4)^6"</span>)     <span class="cm-comment">// returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"</span>
<span class="cm-variable">BinomialExpansion</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(-2a-4)^0"</span>)    <span class="cm-comment">// returns "1"</span>
<span class="cm-variable">BinomialExpansion</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(-12t+43)^2"</span>)  <span class="cm-comment">// returns "144t^2-1032t+1849"</span>
<span class="cm-variable">BinomialExpansion</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(r+0)^203"</span>)    <span class="cm-comment">// returns "r^203"</span>
<span class="cm-variable">BinomialExpansion</span>.<span class="cm-variable">expand</span>(<span class="cm-string">"(-x-1)^2"</span>)     <span class="cm-comment">// returns "x^2+2x+1"</span>
</code></pre>
<pre style="display: none;"><code class="language-rust"><span class="cm-variable">expand</span>(<span class="cm-string">"</span><span class="cm-string">(x+1)^2</span><span class="cm-string">"</span>);      <span class="cm-comment">// returns "x^2+2x+1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"</span><span class="cm-string">(p-1)^3</span><span class="cm-string">"</span>);      <span class="cm-comment">// returns "p^3-3p^2+3p-1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"</span><span class="cm-string">(2f+4)^6</span><span class="cm-string">"</span>);     <span class="cm-comment">// returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"</span><span class="cm-string">(-2a-4)^0</span><span class="cm-string">"</span>);    <span class="cm-comment">// returns "1"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"</span><span class="cm-string">(-12t+43)^2</span><span class="cm-string">"</span>);  <span class="cm-comment">// returns "144t^2-1032t+1849"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"</span><span class="cm-string">(r+0)^203</span><span class="cm-string">"</span>);    <span class="cm-comment">// returns "r^203"</span>
<span class="cm-variable">expand</span>(<span class="cm-string">"</span><span class="cm-string">(-x-1)^2</span><span class="cm-string">"</span>);     <span class="cm-comment">// returns "x^2+2x+1"</span>
</code></pre>
<pre style="display: none;"><code class="language-prolog"><span class="cm-graphic">?-</span><span class="cm-comment"> </span><span class="cm-atom">expand</span><span class="cm-paren">(</span><span class="cm-string">"</span><span class="cm-string">(</span><span class="cm-string">x</span><span class="cm-string">+</span><span class="cm-string">1</span><span class="cm-string">)</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">"</span><span class="cm-paren">,</span><span class="cm-comment"> </span><span class="cm-variable">Expanded</span><span class="cm-paren">)</span><span class="cm-graphic">.</span>
<span class="cm-variable">Expanded</span><span class="cm-comment"> </span><span class="cm-graphic">=</span><span class="cm-comment"> </span><span class="cm-string">"</span><span class="cm-string">x</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">+</span><span class="cm-string">2</span><span class="cm-string">x</span><span class="cm-string">+</span><span class="cm-string">1</span><span class="cm-string">"</span><span class="cm-graphic">.</span>

<span class="cm-graphic">?-</span><span class="cm-comment"> </span><span class="cm-atom">expand</span><span class="cm-paren">(</span><span class="cm-string">"</span><span class="cm-string">(</span><span class="cm-string">p</span><span class="cm-string">-</span><span class="cm-string">1</span><span class="cm-string">)</span><span class="cm-string">^</span><span class="cm-string">3</span><span class="cm-string">"</span><span class="cm-paren">,</span><span class="cm-comment"> </span><span class="cm-variable">Expanded</span><span class="cm-paren">)</span><span class="cm-graphic">.</span>
<span class="cm-variable">Expanded</span><span class="cm-comment"> </span><span class="cm-graphic">=</span><span class="cm-comment"> </span><span class="cm-string">"</span><span class="cm-string">p</span><span class="cm-string">^</span><span class="cm-string">3</span><span class="cm-string">-</span><span class="cm-string">3</span><span class="cm-string">p</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">+</span><span class="cm-string">3</span><span class="cm-string">p</span><span class="cm-string">-</span><span class="cm-string">1</span><span class="cm-string">"</span><span class="cm-graphic">.</span>

<span class="cm-graphic">?-</span><span class="cm-comment"> </span><span class="cm-atom">expand</span><span class="cm-paren">(</span><span class="cm-string">"</span><span class="cm-string">(</span><span class="cm-string">2</span><span class="cm-string">f</span><span class="cm-string">+</span><span class="cm-string">4</span><span class="cm-string">)</span><span class="cm-string">^</span><span class="cm-string">6</span><span class="cm-string">"</span><span class="cm-paren">,</span><span class="cm-comment"> </span><span class="cm-variable">Expanded</span><span class="cm-paren">)</span><span class="cm-graphic">.</span>
<span class="cm-variable">Expanded</span><span class="cm-comment"> </span><span class="cm-graphic">=</span><span class="cm-comment"> </span><span class="cm-string">"</span><span class="cm-string">6</span><span class="cm-string">4</span><span class="cm-string">f</span><span class="cm-string">^</span><span class="cm-string">6</span><span class="cm-string">+</span><span class="cm-string">7</span><span class="cm-string">6</span><span class="cm-string">8</span><span class="cm-string">f</span><span class="cm-string">^</span><span class="cm-string">5</span><span class="cm-string">+</span><span class="cm-string">3</span><span class="cm-string">8</span><span class="cm-string">4</span><span class="cm-string">0</span><span class="cm-string">f</span><span class="cm-string">^</span><span class="cm-string">4</span><span class="cm-string">+</span><span class="cm-string">1</span><span class="cm-string">0</span><span class="cm-string">2</span><span class="cm-string">4</span><span class="cm-string">0</span><span class="cm-string">f</span><span class="cm-string">^</span><span class="cm-string">3</span><span class="cm-string">+</span><span class="cm-string">1</span><span class="cm-string">5</span><span class="cm-string">3</span><span class="cm-string">6</span><span class="cm-string">0</span><span class="cm-string">f</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">+</span><span class="cm-string">1</span><span class="cm-string">2</span><span class="cm-string">2</span><span class="cm-string">8</span><span class="cm-string">8</span><span class="cm-string">f</span><span class="cm-string">+</span><span class="cm-string">4</span><span class="cm-string">0</span><span class="cm-string">9</span><span class="cm-string">6</span><span class="cm-string">"</span><span class="cm-graphic">.</span>

<span class="cm-graphic">?-</span><span class="cm-comment"> </span><span class="cm-atom">expand</span><span class="cm-paren">(</span><span class="cm-string">"</span><span class="cm-string">(</span><span class="cm-string">-</span><span class="cm-string">2</span><span class="cm-string">a</span><span class="cm-string">-</span><span class="cm-string">4</span><span class="cm-string">)</span><span class="cm-string">^</span><span class="cm-string">0</span><span class="cm-string">"</span><span class="cm-paren">,</span><span class="cm-comment"> </span><span class="cm-variable">Expanded</span><span class="cm-paren">)</span><span class="cm-graphic">.</span>
<span class="cm-variable">Expanded</span><span class="cm-comment"> </span><span class="cm-graphic">=</span><span class="cm-comment"> </span><span class="cm-string">"</span><span class="cm-string">1</span><span class="cm-string">"</span><span class="cm-graphic">.</span>

<span class="cm-graphic">?-</span><span class="cm-comment"> </span><span class="cm-atom">expand</span><span class="cm-paren">(</span><span class="cm-string">"</span><span class="cm-string">(</span><span class="cm-string">-</span><span class="cm-string">1</span><span class="cm-string">2</span><span class="cm-string">t</span><span class="cm-string">+</span><span class="cm-string">4</span><span class="cm-string">3</span><span class="cm-string">)</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">"</span><span class="cm-paren">,</span><span class="cm-comment"> </span><span class="cm-variable">Expanded</span><span class="cm-paren">)</span><span class="cm-graphic">.</span>
<span class="cm-variable">Expanded</span><span class="cm-comment"> </span><span class="cm-graphic">=</span><span class="cm-comment"> </span><span class="cm-string">"</span><span class="cm-string">1</span><span class="cm-string">4</span><span class="cm-string">4</span><span class="cm-string">t</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">-</span><span class="cm-string">1</span><span class="cm-string">0</span><span class="cm-string">3</span><span class="cm-string">2</span><span class="cm-string">t</span><span class="cm-string">+</span><span class="cm-string">1</span><span class="cm-string">8</span><span class="cm-string">4</span><span class="cm-string">9</span><span class="cm-string">"</span><span class="cm-graphic">.</span>

<span class="cm-graphic">?-</span><span class="cm-comment"> </span><span class="cm-atom">expand</span><span class="cm-paren">(</span><span class="cm-string">"</span><span class="cm-string">(</span><span class="cm-string">r</span><span class="cm-string">+</span><span class="cm-string">0</span><span class="cm-string">)</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">0</span><span class="cm-string">3</span><span class="cm-string">,</span><span class="cm-string"> </span><span class="cm-string">E</span><span class="cm-string">x</span><span class="cm-string">p</span><span class="cm-string">a</span><span class="cm-string">n</span><span class="cm-string">d</span><span class="cm-string">e</span><span class="cm-string">d</span><span class="cm-string">"</span><span class="cm-paren">)</span><span class="cm-graphic">.</span>
<span class="cm-variable">Expanded</span><span class="cm-comment"> </span><span class="cm-graphic">=</span><span class="cm-comment"> </span><span class="cm-string">"</span><span class="cm-string">r</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">0</span><span class="cm-string">3</span><span class="cm-string">"</span><span class="cm-graphic">.</span>

<span class="cm-graphic">?-</span><span class="cm-comment"> </span><span class="cm-atom">expand</span><span class="cm-paren">(</span><span class="cm-string">"</span><span class="cm-string">(</span><span class="cm-string">-</span><span class="cm-string">x</span><span class="cm-string">-</span><span class="cm-string">1</span><span class="cm-string">)</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">"</span><span class="cm-paren">,</span><span class="cm-comment"> </span><span class="cm-variable">Expanded</span><span class="cm-paren">)</span><span class="cm-graphic">.</span>
<span class="cm-variable">Expanded</span><span class="cm-comment"> </span><span class="cm-graphic">=</span><span class="cm-comment"> </span><span class="cm-string">"</span><span class="cm-string">x</span><span class="cm-string">^</span><span class="cm-string">2</span><span class="cm-string">+</span><span class="cm-string">2</span><span class="cm-string">x</span><span class="cm-string">+</span><span class="cm-string">1</span><span class="cm-string">"</span><span class="cm-graphic">.</span>
</code></pre>