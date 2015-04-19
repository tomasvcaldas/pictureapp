/*
 * Copyright (c) 2015.
 *
 * This file is part of Facility QA Tool App.
 *
 *  Facility QA Tool App is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Facility QA Tool App is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.eyeseetea.malariacare.database.utils;

import com.orm.query.Select;

import org.eyeseetea.malariacare.database.model.OrgUnit;
import org.eyeseetea.malariacare.database.model.Program;
import org.eyeseetea.malariacare.database.model.Survey;
import org.eyeseetea.malariacare.database.model.User;

import java.util.List;

public class Session {

    public static Survey survey;

    public void createSurvey(){
        OrgUnit orgUnit = new OrgUnit("DummyOrgUnit", "Dummy orgUnit");
        orgUnit.save();
        Program program = new Program("DummyProgram", "Dummy program");
        program.save();
        User user = new User("DummyUID", "Dummy user");
        user.save();
        this.survey = new Survey(orgUnit, program, user);
        this.survey.save();
    }

    public void selectSurvey(Survey survey){
        this.survey = survey;
    }

    public Survey getSurvey(){
        return this.survey;
    }
}
