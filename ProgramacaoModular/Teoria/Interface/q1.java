Desenho desenho = new Desenho();

Circulo c = new Circulo();
Retangulo r = new Retangulo();
Triangulo t = new Triangulo();

desenho.adicionarForma(c);
desenho.adicionarForma(r);
desenho.adicionarForma(t);

desenho.renderizarTodasAsFormas();
// Saída esperada:
// O
// []
// Δ
