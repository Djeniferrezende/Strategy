package service;

import service.frete.Normal;

public enum TipoFrete {

    NORMAL{
        public Frete obterFrete(){
            return new Normal();
        }
    },
    SEDEX{
        public Frete obterFrete(){
        return new Normal();
      }
    };

    public abstract Frete obterFrete();

}
