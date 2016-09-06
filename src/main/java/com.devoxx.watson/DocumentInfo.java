/*
 * Copyright 2016 the original author or authors.
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

package com.devoxx.watson;

/**
 * Contains metadata from a given document held in the Devoxx corpus.
 *
 * @author James Weaver
 */
public class DocumentInfo {
  private String id;
  private String score;
  private String title;
  private String body;
  private String docName;

  public DocumentInfo() {
  }

  public DocumentInfo(String id, String score, String title, String body, String docName) {
    this.id = id;
    this.score = score;
    this.title = title;
    this.body = body;
    this.docName = docName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

  @Override
  public String toString() {
    return "DocumentInfo{" +
        "id='" + id + '\'' +
        ", score='" + score + '\'' +
        ", title='" + title + '\'' +
        ", body='" + body + '\'' +
        ", docName='" + docName + '\'' +
        '}';
  }
}
