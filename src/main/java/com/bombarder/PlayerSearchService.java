package com.bombarder;

import io.reactivex.Observable;

public class PlayerSearchService {

    Observable<Player> getAllPlayers(){
        return Observable.fromArray(GameDBDao.get().getAllPlayersFromDB());
    }
}
