package com.gutotech.narutogame.ui.playing.currentvillage;

import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.gutotech.narutogame.data.model.CharOn;
import com.gutotech.narutogame.data.model.Mission;
import com.gutotech.narutogame.data.model.MissionInfo;
import com.gutotech.narutogame.data.model.TimeMission;
import com.gutotech.narutogame.data.repository.MissionRepository;
import com.gutotech.narutogame.ui.adapter.MissionsAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public class MissionsViewModel extends ViewModel implements MissionsAdapter.OnAcceptClickListener {
    private static final long TIME_BASE = 1800000; // 30 minutes

    public final ObservableField<Mission.Type> typeSelected = new ObservableField<>(Mission.Type.TIME);
    public final ObservableField<Mission.Rank> rankSelected = new ObservableField<>(Mission.Rank.RANK_D);

    private MutableLiveData<List<Mission>> mMissions = new MutableLiveData<>();

    public MissionsViewModel() {
        filterMissions();
    }

    LiveData<List<Mission>> getMissions() {
        return mMissions;
    }

    public void onTypeSelected(Mission.Type type) {
        typeSelected.set(type);
        filterMissions();
    }

    public void onRankSelected(Mission.Rank rank) {
        rankSelected.set(rank);
        filterMissions();
    }

    private void filterMissions() {
        List<Mission> missions = new ArrayList<>();

        if (typeSelected.get() == Mission.Type.TIME) {
            if (rankSelected.get() == Mission.Rank.RANK_D) {
                for (MissionInfo missionInfo : EnumSet.range(MissionInfo.MISSION1, MissionInfo.MISSION91)) {
                    missions.add(new TimeMission(missionInfo.name(), TIME_BASE));
                }
            } else if (rankSelected.get() == Mission.Rank.RANK_C) {
                for (MissionInfo missionInfo : EnumSet.range(MissionInfo.MISSION92, MissionInfo.MISSION167)) {
                    missions.add(new TimeMission(missionInfo.name(), TIME_BASE));
                }
            } else if (rankSelected.get() == Mission.Rank.RANK_B) {
                for (MissionInfo missionInfo : EnumSet.range(MissionInfo.MISSION168, MissionInfo.MISSION238)) {
                    missions.add(new TimeMission(missionInfo.name(), TIME_BASE));
                }
            } else if (rankSelected.get() == Mission.Rank.RANK_A) {
                for (MissionInfo missionInfo : EnumSet.range(MissionInfo.MISSION239, MissionInfo.MISSION297)) {
                    missions.add(new TimeMission(missionInfo.name(), TIME_BASE));
                }
            } else { // Rank S
                for (MissionInfo missionInfo : EnumSet.range(MissionInfo.MISSION298, MissionInfo.MISSION371)) {
                    missions.add(new TimeMission(missionInfo.name(), TIME_BASE));
                }
            }
        } else { // Type == Special
            if (rankSelected.get() == Mission.Rank.RANK_D) {

            } else if (rankSelected.get() == Mission.Rank.RANK_C) {

            } else if (rankSelected.get() == Mission.Rank.RANK_B) {

            } else if (rankSelected.get() == Mission.Rank.RANK_A) {

            } else { // Rank S

            }
        }

        if (CharOn.character.getResumeOfMissions().getMissionsFinishedId() != null) {
            Collections.sort(CharOn.character.getResumeOfMissions().getMissionsFinishedId());

            int idCountRemoved = 0;

            for (int missionId : CharOn.character.getResumeOfMissions().getMissionsFinishedId()) {
                if (missionId > 9) {
                    missions.remove((missionId - 10) - idCountRemoved);
                    idCountRemoved++;
                }
            }
        }

        mMissions.setValue(missions);
    }

    @Override
    public void onAcceptClick(Mission task) {
        TimeMission timeMission = (TimeMission) task;
        MissionRepository.getInstance().acceptTimeMission(timeMission);
        CharOn.character.setMission(true);
    }
}
