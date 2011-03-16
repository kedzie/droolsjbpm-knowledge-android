/*
 * Copyright 2005 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.event.process;


import java.util.EventListener;

public interface ProcessEventListener
    extends
    EventListener {

    void beforeProcessStarted(ProcessStartedEvent event);

    void afterProcessStarted(ProcessStartedEvent event);

    void beforeProcessCompleted(ProcessCompletedEvent event);

    void afterProcessCompleted(ProcessCompletedEvent event);

    void beforeNodeTriggered(ProcessNodeTriggeredEvent event);

    void afterNodeTriggered(ProcessNodeTriggeredEvent event);

    void beforeNodeLeft(ProcessNodeLeftEvent event);

    void afterNodeLeft(ProcessNodeLeftEvent event);
    
    void beforeVariableChanged(ProcessVariableChangedEvent event);

    void afterVariableChanged(ProcessVariableChangedEvent event);

}