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
                <li><a href="./login">Login</li>
                <li><a href="./cadastrar">Cadastrar</li>
            </ul>
        </header>`
    }
}

customElements.define('toolbar-sith', Toolbar)
