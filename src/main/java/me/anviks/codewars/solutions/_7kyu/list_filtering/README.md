<p>In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.</p>
<h3 id="example">Example</h3>
<pre style="display: none;"><code class="language-python"><span class="cm-variable">filter_list</span>([<span class="cm-number">1</span>,<span class="cm-number">2</span>,<span class="cm-string">'a'</span>,<span class="cm-string">'b'</span>]) <span class="cm-operator">==</span> [<span class="cm-number">1</span>,<span class="cm-number">2</span>]
<span class="cm-variable">filter_list</span>([<span class="cm-number">1</span>,<span class="cm-string">'a'</span>,<span class="cm-string">'b'</span>,<span class="cm-number">0</span>,<span class="cm-number">15</span>]) <span class="cm-operator">==</span> [<span class="cm-number">1</span>,<span class="cm-number">0</span>,<span class="cm-number">15</span>]
<span class="cm-variable">filter_list</span>([<span class="cm-number">1</span>,<span class="cm-number">2</span>,<span class="cm-string">'aasf'</span>,<span class="cm-string">'1'</span>,<span class="cm-string">'123'</span>,<span class="cm-number">123</span>]) <span class="cm-operator">==</span> [<span class="cm-number">1</span>,<span class="cm-number">2</span>,<span class="cm-number">123</span>]
</code></pre>
<pre style="display: none;"><code class="language-csharp"><span class="cm-variable">ListFilterer</span>.<span class="cm-variable">GetIntegersFromList</span>(<span class="cm-keyword">new</span> <span class="cm-variable">List</span><span class="cm-operator">&lt;</span><span class="cm-type">object</span><span class="cm-operator">&gt;</span>(){<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>}) <span class="cm-operator">=&gt;</span> {<span class="cm-number">1</span>, <span class="cm-number">2</span>}
<span class="cm-variable">ListFilterer</span>.<span class="cm-variable">GetIntegersFromList</span>(<span class="cm-keyword">new</span> <span class="cm-variable">List</span><span class="cm-operator">&lt;</span><span class="cm-type">object</span><span class="cm-operator">&gt;</span>(){<span class="cm-number">1</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>, <span class="cm-number">0</span>, <span class="cm-number">15</span>}) <span class="cm-operator">=&gt;</span> {<span class="cm-number">1</span>, <span class="cm-number">0</span>, <span class="cm-number">15</span>}
<span class="cm-variable">ListFilterer</span>.<span class="cm-variable">GetIntegersFromList</span>(<span class="cm-keyword">new</span> <span class="cm-variable">List</span><span class="cm-operator">&lt;</span><span class="cm-type">object</span><span class="cm-operator">&gt;</span>(){<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>, <span class="cm-string">"aasf"</span>, <span class="cm-string">"1"</span>, <span class="cm-string">"123"</span>, <span class="cm-number">123</span>}) <span class="cm-operator">=&gt;</span> {<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-number">231</span>}
</code></pre>
<pre style="display: none;"><code class="language-factor"><span class="cm-keyword">{</span> <span class="cm-number">1 2</span> <span class="cm-string">"</span><span class="cm-string">a"</span> <span class="cm-string">"</span><span class="cm-string">b"</span> <span class="cm-keyword">}</span> <span class="cm-variable">filter-seq</span> <span class="cm-comment">! { 1 2 }</span>
<span class="cm-keyword">{</span> <span class="cm-number">1</span> <span class="cm-string">"</span><span class="cm-string">a"</span> <span class="cm-string">"</span><span class="cm-string">b"</span> <span class="cm-number">0 15</span> <span class="cm-keyword">}</span> <span class="cm-variable">filter-seq</span> <span class="cm-comment">! { 1 0 15 }</span>
<span class="cm-keyword">{</span> <span class="cm-number">1 2</span> <span class="cm-string">"</span><span class="cm-string">aasf"</span> <span class="cm-string">"</span><span class="cm-string">1"</span> <span class="cm-string">"</span><span class="cm-string">123"</span> <span class="cm-number">123</span> <span class="cm-keyword">}</span> <span class="cm-variable">filter-seq</span> <span class="cm-comment">! { 1 2 123 }</span>
</code></pre>
<pre><code class="language-java"><span class="cm-variable">Kata</span>.<span class="cm-variable">filterList</span>(<span class="cm-variable">List</span>.<span class="cm-variable">of</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>)) <span class="cm-operator">=&gt;</span> <span class="cm-variable">List</span>.<span class="cm-variable">of</span>(<span class="cm-number">1</span>,<span class="cm-number">2</span>)
<span class="cm-variable">Kata</span>.<span class="cm-variable">filterList</span>(<span class="cm-variable">List</span>.<span class="cm-variable">of</span>(<span class="cm-number">1</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>, <span class="cm-number">0</span>, <span class="cm-number">15</span>)) <span class="cm-operator">=&gt;</span> <span class="cm-variable">List</span>.<span class="cm-variable">of</span>(<span class="cm-number">1</span>,<span class="cm-number">0</span>,<span class="cm-number">15</span>)
<span class="cm-variable">Kata</span>.<span class="cm-variable">filterList</span>(<span class="cm-variable">List</span>.<span class="cm-variable">of</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>, <span class="cm-string">"aasf"</span>, <span class="cm-string">"1"</span>, <span class="cm-string">"123"</span>, <span class="cm-number">123</span>)) <span class="cm-operator">=&gt;</span> <span class="cm-variable">List</span>.<span class="cm-variable">of</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-number">123</span>)
</code></pre>
<pre style="display: none;"><code class="language-scala"><span class="cm-variable">filterList</span>(<span class="cm-type">List</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>)) <span class="cm-operator">==</span> <span class="cm-type">List</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>)
<span class="cm-variable">filterList</span>(<span class="cm-type">List</span>(<span class="cm-number">1</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>, <span class="cm-number">0</span>, <span class="cm-number">15</span>)) <span class="cm-operator">==</span> <span class="cm-type">List</span>(<span class="cm-number">1</span>, <span class="cm-number">0</span>, <span class="cm-number">15</span>)
<span class="cm-variable">filterList</span>(<span class="cm-type">List</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-string">"aasf"</span>, <span class="cm-string">"1"</span>, <span class="cm-string">"123"</span>, <span class="cm-number">123</span>)) <span class="cm-operator">==</span> <span class="cm-type">List</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-number">123</span>)
</code></pre>
<pre style="display: none;"><code class="language-kotlin"><span class="cm-variable">filterList</span>(<span class="cm-variable">ListOf</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>)) <span class="cm-operator">==</span> [<span class="cm-number">1</span>, <span class="cm-number">2</span>]
<span class="cm-variable">filterList</span>(<span class="cm-variable">ListOf</span>(<span class="cm-number">1</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>, <span class="cm-number">0</span>, <span class="cm-number">15</span>)) <span class="cm-operator">==</span> [<span class="cm-number">1</span>, <span class="cm-number">0</span>, <span class="cm-number">15</span>]
<span class="cm-variable">filterList</span>(<span class="cm-variable">ListOf</span>(<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-string">"a"</span>, <span class="cm-string">"b"</span>, <span class="cm-string">"aasf"</span>, <span class="cm-string">"1"</span>, <span class="cm-string">"123"</span>, <span class="cm-number">123</span>)) <span class="cm-operator">==</span> [<span class="cm-number">1</span>, <span class="cm-number">2</span>, <span class="cm-number">123</span>]
</code></pre>