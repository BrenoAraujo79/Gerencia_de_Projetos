class Toolbar extends HTMLElement {
    constructor() {
        super()
        this.innerHTML = `
        <link rel="stylesheet" href="../css/toolbar-style.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <header>
            <div class="logo">
                <img src="../images/relogio_ponto.jpg">
            </div>
            <ul>
                <li> <a href="./home">Home</a>  </li>
                <li><a href="./filmes">Filmes</li>
                <li><a href="./series">Séries</li>
                <li><a href="./login">Login</a></li>
            </ul>
            <div class="spacer"></div>
            <div class="busca">
                <input type="text" placeholder="Search a movie">
                <button class="submit">
                    <i id="search" style="color: black;" class="material-icons">search</i>
                </button>
            </div>
        </header>`
    }
}

customElements.define('toolbar', Toolbar)
