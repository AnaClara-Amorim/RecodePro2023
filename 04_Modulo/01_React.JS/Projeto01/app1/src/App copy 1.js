import './App.css';
/* import './components/Botao' */ /* Importando botão criado */
import Menu from './components/Menu'
import Corpo from './components/Corpo'
import Rodape from './components/Rodape'

function App() {

  const Estilo = {
    color: 'red',
    textAling: 'left',
  }

  return (
   /*  <>    
    <div className="App">
      <p style = {{color: 'green'}}>Olá, mundo!</p>
    </div>    
    <div className="App">
      <p style = {Estilo}>Olá, mundo!</p>
    </div>       
      </> */

      <div>
        <Menu/>
        <Corpo/>
        <Rodape/>
      </div>

  );
}

export default App;
