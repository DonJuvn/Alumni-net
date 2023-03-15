class MyHeader extends HTMLElement{
    connectedCallback(){
        this.innerHTML = '

            <header class="header">
              <div class="container">
                <div class="header__inner">
                  <a href="main"><img class="logo" src="/img/logo.png" href="profile" alt=""></a>
                  <!-- <div class="navbar"> -->
                  <nav class="nav">
                    <a class="nav__link" href="main">Басты бет</a>
                    <a class="nav__link" href="news">Жаңалықтар</a>
                    <a class="nav__link" href="products">Хабарландыру</a>
                    <a class="nav__link" href="friends">Достар</a>
                    <a class="nav__link" href="mezuns">Тізім</a>
                  </nav>

                  <div class="buttons">
                    <button class="btn">
                      <a href="profile"><i><img src="/img/user.png" alt=""></i></a>
                    </button>
                    <button class="brn">
                      <i>lang</i>
                    </button>

                  </div>
                </div>
                <!-- </div> -->
              </div>
            </header>
        '
    }
}

customElements.define('my-header', MyHeader);